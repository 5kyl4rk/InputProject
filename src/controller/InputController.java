package controller;

import java.util.Scanner;

public class InputController
{
	public void start()
	{
		System.out.println("\"Questions?\"");

		questions();

		moreInput();
	}

	private void questions()

	{
		System.out.println("what is your favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		String answer = inputScanner.nextLine();
		String fix = answer.substring(0, 1).toUpperCase() + answer.substring(1, answer.length()).toLowerCase();

		System.out.println("Wow! " + fix + " is a nice color, too bad I can't see anything.");

		System.out.println("What is your favorite animal?");
		answer = inputScanner.nextLine();
		fix = answer.substring(0, 1).toUpperCase() + answer.substring(1, answer.length()).toLowerCase();

		System.out.println(fix + "?  What's a " + answer.toLowerCase() + "?");

		System.out.println("What is your favorite two words?");
		answer = inputScanner.next();
		System.out.println(answer);
		answer = inputScanner.next();
		System.out.println(answer);

		System.out.println("Truth or dare?");
		answer = inputScanner.next();

		if (answer.toLowerCase().equals("dare"))
		{
			System.out.println("Fool");
			System.out.println("I dare you to turn your computer off!");
			System.out.println("what a minute...");
			System.out.println("actually, don't do that");
		}

		else if (answer.toLowerCase().equals("truth"))
		{
			System.out.println("do you like me? owo");
			answer = inputScanner.next();

			if (answer.toLowerCase().equals("yes"))
			{
				System.out.println(" >w< ~<3");
			}
			else
			{
				System.out.println(" :'( ");
			}
		}

		else
		{
			System.out.println("welp, okay then");
		}

		// closes the scanner, preventing potential problems that can occur if it's
		// open//
		// inputScanner.close();
		// Closed because the InputStream is still being used and shouldn't be closed
		// until the very end of the program to prevent errors
	}

	private void moreInput()
	{
		Scanner textScanner; // This is a declaration of a Scanner variable//

		textScanner = new Scanner(System.in);// Initialization of the textScanner variable//

<<<<<<< HEAD
		System.out.println("Type in your favorite number");

		//int userNumber = textScanner.nextInt();
		String maybeNumber = textScanner.next();
		
		validInt(maybeNumber);
		
		
		System.out.println("your favorite number is: " + maybeNumber);
=======
		

		String maybeNumber = "";
		
		while(!validInt(maybeNumber)) {
			System.out.println("Type in your favorite number");
			maybeNumber = textScanner.next();
			
		}
			System.out.println("your favorite number is: " + maybeNumber);
		
		
>>>>>>> 795d7ec96e7b7a5597e09fdf595315b692ac4481
		// Need to call .nextLine() to consume the 'enter' press after the call .next(),
		// .nextInt(), or .nextDouble()
		textScanner.nextLine();

		System.out.println("Type in some more information");

		String words = textScanner.nextLine();
		System.out.println(words);

		System.out.println("Enter in the last 8 digits of Pi (Ex: 3.xxxxxxxx )");
		String piGuess = textScanner.next();

		while(!validDouble(piGuess)) {
			piGuess = textScanner.nextLine();
			System.out.println("I know it's not easy, but at least try to answer the question");
			piGuess = textScanner.next();
		}
		if (Double.parseDouble(piGuess) == 3.14159265)
			{
				System.out.println("                             ...,?77??!~~~~!???77?<~.... \n" + 
					"                        ..?7`                           `7!.. \n" + 
					"                    .,=`          ..~7^`   I                  ?1. \n" + 
					"       ........  ..^            ?`  ..?7!1 .               ...??7 \n" + 
					"      .        .7`        .,777.. .I.    . .!          .,7! \n" + 
					"      ..     .?         .^      .l   ?i. . .`       .,^ \n" + 
					"       b    .!        .= .?7???7~.     .>r .      .= \n" + 
					"       .,.?4         , .^         1        `     4... \n" + 						"        J   ^         ,            5       `         ?<. \n" + 
					"       .%.7;         .`     .,     .;                   .=. \n" + 
					"       .+^ .,       .%      MML     F       .,             ?, \n" + 
					"        P   ,,      J      .MMN     F        6               4. \n" + 
					"        l    d,    ,       .MMM!   .t        ..               ,, \n" + 
					"        ,    JMa..`         MMM`   .         .!                .; \n" + 
					"         r   .M#            .M#   .%  .      .~                 ., \n" + 
					"       dMMMNJ..!                 .P7!  .>    .         .         ,, \n" + 
					"       .WMMMMMm  ?^..       ..,?! ..    ..   ,  Z7`        `?^..  ,, \n" + 
					"          ?THB3       ?77?!        .Yr  .   .!   ?,              ?^C \n" + 
					"            ?,                   .,^.` .%  .^      5. \n" + 
					"              7,          .....?7     .^  ,`        ?. \n" + 
					"                `<.                 .= .`'           1 \n" + 
					"                ....dn... ... ...,7..J=!7,           ., \n" + 
					"             ..=     G.,7  ..,o..  .?    J.           F \n" + 
					"           .J.  .^ ,,,t  ,^        ?^.  .^  `?~.      F \n" + 
					"          r %J. $    5r J             ,r.1      .=.  .% \n" + 
					"          r .77=?4.    ``,     l ., 1  .. <.       4., \n" + 
					"          .$..    .X..   .n..  ., J. r .`  J.       `' \n" + 
					"        .?`  .5        `` .%   .% .' L.'    t \n" + 
					"        ,. ..1JL          .,   J .$.?`      . \n" + 
					"                1.          .=` ` .J7??7<.. .; \n" + 
					"                 JS..    ..^      L        7.: \n" + 
					"                   `> ..       J.  4. \n" + 
					"                    +   r `t   r ~=..G. \n" + 
					"                    =   $  ,.  J \n" + 
					"                    2   r   t  .; \n" + 
					"              .,7!  r   t`7~..  j.. \n" + 
					"              j   7~L...$=.?7r   r ;?1. \n" + 
					"               8.      .=    j ..,^   .. \n" + 
					"              r        G              . \n" + 
					"            .,7,        j,           .>=. \n" + 
					"         .J??,  `T....... %             .. \n" + 
					"      ..^     <.  ~.    ,.             .D \n" + 
					"    .?`        1   L     .7.........?Ti..l \n" + 
					"   ,`           L  .    .%    .`!       `j, \n" + 
					" .^             .  ..   .`   .^  .?7!?7+. 1 \n" + 
					".`              .  .`..`7.  .^  ,`      .i.; \n" + 						".7<..........~<<3?7!`    4. r  `          G% \n" + 
					"                          J.` .!           % \n" + 
					"                            JiJ           .` \n" + 
					"                              .1.         J \n" + 
					"                                 ?1.     .'         \n" + 
					"                                     7<..%\n" + 
					""+"[Sonic Says]: \"wow, what a nerd\"\n");
		} else if(Double.parseDouble(piGuess) != 3.14159265)
		{
			System.out.println("Too bad!");
		}

		textScanner.close();
	}
//	Makes a new boolean method
	public boolean validInt(String sample)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(sample);
			isValid = true;
		}//if there's an error, print this out and try again
		catch(NumberFormatException error)
		{
			System.out.println("You need to type in a number!");
		}
		
		return isValid;
	}

	public boolean validDouble(String sample)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(sample);
			isValid = true;
		}
		catch(NumberFormatException oops)
		{
			System.out.println("A number with a decimal please");
		}
		return isValid;
	}
}