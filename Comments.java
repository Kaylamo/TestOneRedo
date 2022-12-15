import java.io.*;
import java.lang.*;
import java.util.*;

class Comments{
static void Comment(String C)
{
	char input[] = C.toCharArray();
	if (input[0] == '/' && input[1] == '/' )
	{
		System.out.println(
			"It is a single-line comment");
		return;
	}

	if (input[0]=='/' && input[1]=='*' && input[input.length - 2] == '*' &&
		input[input.length - 1] == '/')
	{
		System.out.println(
			"It is a multi-line comment");
		return;
	}
	System.out.println("It is not a comment");
}
// Driver
public static void main(String[] args)
{
	// Input code here
	String input = "/*/*/*/*";
	Comment(input);
}
}

