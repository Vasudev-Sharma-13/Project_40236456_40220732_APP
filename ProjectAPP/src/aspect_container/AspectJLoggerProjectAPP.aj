package aspect_container;

import java.util.Stack;
import org.aspectj.lang.reflect.MethodSignature;
import java.io.PrintWriter;
import java.util.ArrayList;

public aspect AspectJLoggerProjectAPP {
	// Attributes of the AspectJ file
	private final String PATHOFTEXTFILEGENERATED = "C:\\Users\\Administrator\\Desktop\\loggerProjectAPPSequence.txt"; // contains
																												// path
																												// of
																												// file

	private int stackCount = 0; // variable which counter number of elements in the stack
	private ArrayList<String> inputForSequenceTool = new ArrayList<String>(); // Stores the line by line for text file
																				// generated
	private final String emptyClass = "NULL"; // checks for class name with null type
	Stack<String> flowOfControl = null; // create a stack of string

	AspectJLoggerProjectAPP() {
		inputForSequenceTool.add("@startuml");
		inputForSequenceTool.add("!spacelab");
		inputForSequenceTool.add("autonumber 01 01 \"<b>[0000]\"");
		flowOfControl = new Stack<String>();
		flowOfControl.push(emptyClass);
	}

	pointcut projectPointCutCapture(): !within(AspectJLoggerProjectAPP) && (execution(* *.*(..))||execution(*.new(..)))&& !cflow(execution (* java.*.*.*(..)));

	public void writerToTextFile() { // function to write the text file which will serve as input to our TOOL

		try {
			PrintWriter filewriterToTextFile = new PrintWriter(PATHOFTEXTFILEGENERATED);
			for (int i = 0; i < inputForSequenceTool.size(); i++) {
				filewriterToTextFile.println(inputForSequenceTool.get(i));
			}
			filewriterToTextFile.close();
		} catch (Exception e) { // catches all kinds of exception thrown if there is an error during the life
								// cycle of the AspectJ code
			System.out.println("Failed To Generate File,check file path in source code or File Write error in AspectJ");
		}

	}

	before():projectPointCutCapture() { // Advice running before the function execution, gets the
		// class-name,return type of the function, function identifier and adds to
		// flowOfControl stack
		String classIdentifier;
		try {
			classIdentifier = thisJoinPoint.getSignature().getDeclaringTypeName();// gives class Name
		} catch (NullPointerException e) {
			classIdentifier = thisJoinPoint.getThis().getClass().getName(); // gives class where constructor execution
																			// is captured
		}

		String methodExecutionIdentifier = thisJoinPoint.getSignature().getName();
		String returnTypingOfFunction;

		try {

			returnTypingOfFunction = ((MethodSignature) thisJoinPoint.getSignature()).getReturnType().getSimpleName();

		} catch (ClassCastException e) {

			returnTypingOfFunction = thisJoinPoint.getSignature().getDeclaringTypeName();

		}
		String lastClass = flowOfControl.peek();

		String colour = "";

		if (methodExecutionIdentifier == "passwordCheck") {
			colour = "[#blue]"; // assigning the color red to the password authentication method
		} else if (methodExecutionIdentifier.startsWith("get") == true) {
			colour = "[#yellow]"; // assigning the color green to the getters
		}

		if (lastClass.equals(emptyClass)) {
			inputForSequenceTool.add("[-" + colour + "> " + classIdentifier + ": " + returnTypingOfFunction + " "
					+ methodExecutionIdentifier); // generating
			// input text for the tool

		} else {
			inputForSequenceTool.add(lastClass + " -" + colour + "> " + classIdentifier + ": " + returnTypingOfFunction
					+ " " + methodExecutionIdentifier);// this statement also generates input text for the TOOL
		}
		inputForSequenceTool.add("|||");
		flowOfControl.push(classIdentifier);
		stackCount++;
	}

	after(): projectPointCutCapture(){ // advice running after the execution of the function

		stackCount--;
		flowOfControl.pop();

		if (stackCount == 0) {
			inputForSequenceTool.add("@enduml");
			writerToTextFile();
		}
	}

}
