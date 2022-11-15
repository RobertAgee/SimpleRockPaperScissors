import java.util.Scanner;

public class SimpleRockPaperScissors {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		String playerChoice = "";
		String computerChoice = "";
		double computerChose = 0.0;
		int gamesWin = 0;
		int gamesTie = 0;
		int gamesLose = 0;
		int gamesTotal = 0;
		int youRock = 0;
		int youPaper = 0;
		int youScissors = 0;
		int compRock = 0;
		int compPaper = 0;
		int compScissors = 0;
		
		
				
		char continueApp = 'y';
		Scanner scan = new Scanner(System.in);
		while (continueApp == 'y' || continueApp == 'Y') {

			System.out.println("*************************************************");
			System.out.println("\t WELCOME TO ROCK PAPER SCISSORS");
			System.out.println("*************************************************");
			System.out.println("\t\tMAKE YOUR CHOICE");
			System.out.println("*************************************************");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors");
			System.out.println("4. Statistics");
			System.out.println("5. Quit");
			System.out.println("*************************************************");
			System.out.println("Please enter an option : ");
			int logOption = 0;
			while(logOption != 1 && logOption != 2 && logOption != 3) {
			logOption = scan.nextInt();
			switch (logOption) {
			case 1:
				playerChoice = "Rock";
				youRock++;
				computerChose = Math.random();
				break;
			case 2:
				playerChoice = "Paper";
				youPaper++;
				computerChose = Math.random();
				break;
			case 3:
				playerChoice = "Scissors";
				youScissors++;
				computerChose = Math.random();
				break;
			case 4:
				System.out.println("Games Total: " + gamesTotal);
				System.out.println("Games  Won: " + gamesWin + "\t\t   | Percentage: " + 100*gamesWin/gamesTotal + "%");
				System.out.println("Games Tied: " + gamesTie + "\t\t   | Percentage: " + 100*gamesTie/gamesTotal + "%");
				System.out.println("Games Lost: " + gamesLose + "\t\t   | Percentage: " + 100*gamesLose/gamesTotal + "%");
				System.out.println("============================================");
				System.out.println("You Chose Rock: " + youRock + "\t   | Percentage: " + 100*youRock/gamesTotal + "%");
				System.out.println("You Chose Paper: " + youPaper + "\t   | Percentage: " + 100*youPaper/gamesTotal + "%");
				System.out.println("You Chose Scissors: " + youScissors + "\t   | Percentage: " + 100*youScissors/gamesTotal + "%");
				System.out.println("============================================");
				System.out.println("Computer Chose Rock: " + compRock + "\t   | Percentage: " + 100*compRock/gamesTotal + "%");
				System.out.println("Computer Chose Paper: " + compPaper + "\t   | Percentage: " + 100*compPaper/gamesTotal + "%");
				System.out.println("Computer Chose Scissors: " + compScissors + " | Percentage: " + 100*compScissors/gamesTotal + "%");
				System.out.println(" ");
				Scanner sc = new Scanner(System.in);
				System.out.println("Press enter to continue");
				String pauser = sc.nextLine();
				break;
			case 5:
				System.out.println("*************************************************");
				System.out.println("\tTHANK YOU FOR PLAYING!!");
				System.out.println("*************************************************");
				System.exit(0);
				break;
			default:
				System.out.println("Please re-enter a valid option!!");
				break;
			}
			}
				
			if(computerChose <= 0.33) {
				computerChoice = "Rock";
				compRock++;
			} else if(computerChose > 0.33 && computerChose <= 0.66) {
				computerChoice = "Paper";
				compPaper++;
			} else if(computerChose > 0.66) {
				computerChoice = "Scissors";
				compScissors++;
			}
			
			
			System.out.println("You chose " + playerChoice + " and Computer chose " + computerChoice + "!!");
			if(playerChoice == "Rock" && computerChoice == "Rock") {
				
				System.out.println("      (^^^^^)              (^^^^^)");
				System.out.println("     (^^^^^^^)            (^^^^^^^)");
				System.out.println("    (^^^^^^^^^)   V.S.   (^^^^^^^^^)");
				System.out.println("     (^^^^^^^)            (^^^^^^^)");
				System.out.println("      (^^^^^)              (^^^^^)");
				System.out.println("\t\tTIE!!");
				gamesTie++;
				gamesTotal++;
			} else if(playerChoice == "Rock" && computerChoice == "Paper") {
				System.out.println("      (^^^^^)            )^^^^^^^)");
				System.out.println("     (^^^^^^^)            )^^^^^^^)");
				System.out.println("    (^^^^^^^^^)   V.S.   )^^^^^^^)");
				System.out.println("     (^^^^^^^)            )^^^^^^^)");
				System.out.println("      (^^^^^)              )^^^^^^^)");
				
				System.out.println("\t\tYOU LOSE!!");
				gamesLose++;
				gamesTotal++;
			} else if(playerChoice == "Rock" && computerChoice == "Scissors") {
				System.out.println("      (^^^^^)            \\\\    (O)");
				System.out.println("     (^^^^^^^)            \\\\   //");
				System.out.println("    (^^^^^^^^^)   V.S.     >>0<<");
				System.out.println("     (^^^^^^^)            //   \\\\");
				System.out.println("      (^^^^^)            //    (O)");
				
				System.out.println("\t\tYOU WIN!!");
				gamesWin++;
				gamesTotal++;
			} else if(playerChoice == "Paper" && computerChoice == "Rock") {
				System.out.println("    )^^^^^^^)              (^^^^^)");
				System.out.println("     )^^^^^^^)            (^^^^^^^)");
				System.out.println("    )^^^^^^^)     V.S.   (^^^^^^^^^)");
				System.out.println("     )^^^^^^^)            (^^^^^^^)");
				System.out.println("      )^^^^^^^)            (^^^^^)");
				System.out.println("\t\tYOU WIN!!");
				gamesWin++;
				gamesTotal++;
			} else if(playerChoice == "Paper" && computerChoice == "Paper") {
				System.out.println("    )^^^^^^^)            )^^^^^^^)");
				System.out.println("     )^^^^^^^)            )^^^^^^^)");
				System.out.println("    )^^^^^^^)     V.S.   )^^^^^^^)");
				System.out.println("     )^^^^^^^)            )^^^^^^^)");
				System.out.println("      )^^^^^^^)            )^^^^^^^)");
				System.out.println("\t\tTIE!!");
				gamesTie++;
				gamesTotal++;
			} else if(playerChoice == "Paper" && computerChoice == "Scissors") {
				System.out.println("    )^^^^^^^)            \\\\    (O)");
				System.out.println("     )^^^^^^^)            \\\\   //");
				System.out.println("    )^^^^^^^)     V.S.     >>0<<");
				System.out.println("     )^^^^^^^)            //   \\\\");
				System.out.println("      )^^^^^^^)          //    (O)");
				System.out.println("\t\tYOU LOSE!!");
				gamesLose++;
				gamesTotal++;
			} else if(playerChoice == "Scissors" && computerChoice == "Rock") {
				System.out.println("     (O)    //            (^^^^^)");
				System.out.println("      \\\\   //            (^^^^^^^)");
				System.out.println("       >>0<<      V.S.  (^^^^^^^^^)");
				System.out.println("      //   \\\\            (^^^^^^^)");
				System.out.println("     (O)    \\\\            (^^^^^)");
				System.out.println("\t\tYOU LOSE!!");
				gamesLose++;
				gamesTotal++;
			} else if(playerChoice == "Scissors" && computerChoice == "Paper") {
				System.out.println("     (O)    //           )^^^^^^^)");
				System.out.println("      \\\\   //             )^^^^^^^)");
				System.out.println("       >>0<<      V.S.   )^^^^^^^)");
				System.out.println("      //   \\\\             )^^^^^^^)");
				System.out.println("     (O)    \\\\             )^^^^^^^)");
				System.out.println("\t\tYOU WIN!!");
				gamesWin++;
				gamesTotal++;
			} else if(playerChoice == "Scissors" && computerChoice == "Scissors") {
				System.out.println("     (O)    //           \\\\    (O)");
				System.out.println("      \\\\   //             \\\\   //");
				System.out.println("       >>0<<      V.S.     >>0<<");
				System.out.println("      //   \\\\             //   \\\\");
				System.out.println("     (O)    \\\\           //    (O)");
				System.out.println("\t\tTIE!!");
				gamesTie++;
				gamesTotal++;
			} else {
				System.exit(0);
			}
					
			Scanner sc = new Scanner(System.in);
			System.out.println("Press enter to continue");
			String pauser = sc.nextLine();
			}
		}

	}

