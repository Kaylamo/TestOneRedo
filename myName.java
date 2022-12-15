import java.io.*;
import java.lang.*;
import java.util.*;

class myName{
static void Comment(String C)
{
	char input[] = C.toCharArray();
  // UPPERCASE
	if (input[0] == 'K' && input[1] == 'A' && input[2] == 'Y' && input[3] == 'L' && input[4] == 'A' )
	{
		System.out.println(
			"This is my name");
		return;
	}
	//System.out.println("It is not my name");
  if (input[0] == 'M' && input[1] == 'O' && input[2] == 'O' && input[3] == 'R' && input[4] == 'E' )
	{
		System.out.println(
			"This is my name");
		return;
	}
  //lowercase
  if (input[0] == 'k' && input[1] == 'a' && input[2] == 'y' && input[3] == 'l' && input[4] == 'a' )
	{
		System.out.println(
			"This is my name");
		return;
	}
  if (input[0] == 'm' && input[1] == 'o' && input[2] == 'o' && input[3] == 'r' && input[4] == 'e' )
	{
		System.out.println(
			"This is my name");
		return;
	}
	System.out.println("It is not my name");
}
// Driver
public static void main(String[] args)
{
	// Input code here
	String input = "chinua";
	Comment(input);
}
}

