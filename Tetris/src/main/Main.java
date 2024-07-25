package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Random rd = new Random();
		Scanner in = new Scanner(System.in);
		String[][] game = new String[40][25];
		for(int i = 0; i < game.length; i++) {
			for(int j = 0; j < game[0].length; j++) {
				game[i][j] = " ";
			}
		}
		String[][] square1 = {{"□", " "}, {"□", "□"}, {" ", "□"}};
		String[][] square2 = {{"□"},{"□"},{"□"},{"□"}};
		String[][] square3 = {{" ", "□"}, {"□", "□"}, {" ", "□"}};
		String[][] square4 = {{"□", "□"}, {"□", "□"}};
		String[][] square5 = {{" ", "□"}, {" ", "□"}, {"□", "□"}};
		String[][] square6 = {{" ", "□", "□"}, {"□", "□", " "}};
		String[][] square7 = {{"□", "□", "□", "□"}};
		String[][] square8 = {{" ", "□", " "}, {"□", "□", "□"}};
		String[][] square9 = {{"□", "□", "□"}, {" ", "□", " "}};
		String[][] square10 = {{"□", " "}, {"□", "□"}, {"□", " "}};
		String[][] square11 = {{"□", " ", " "}, {"□", "□", "□"}};
		String[][] square12 = {{"□", "□", "□"}, {" ", " ", "□"}};
		String[][] shape = new String[4][4];
		int point = 0;
		int step = 50;
		int score = 50;
		int level = 1;
		int end = 0;
		System.out.println("테트리스 게임 시작!");
		Thread.sleep(1000);
		for(int n = step; n > 0; n--) {	
			System.out.println("---------------------------");
			System.out.println("| 점수 | "+point+" |      | 기회 | " +n+" | ");
			System.out.println("---------------------------");
			System.out.println("---------------------------");
			System.out.println("| 목표 점수 | "+score+" | level1 | " +level+" | ");
			System.out.println("---------------------------");		
			for(int i = 0; i < shape.length; i++) {
				for(int j = 0; j < shape[0].length; j++) {
					shape[i][j] = " ";
				}
			}
			int num = rd.nextInt(12)+1;
			if(num == 1) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >= square1.length || j == square1[0].length) {
							break;
						}
						shape[i][j] = square1[i][j];
					}
				}
			} else if(num == 2) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >= square2.length || j == square2[0].length) {
							break;
						}
						shape[i][j] = square2[i][j];
					}
				}
			} else if(num == 3) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >= square3.length || j == square3[0].length) {
							break;
						}
						shape[i][j] = square3[i][j];
					}
				}
			} else if(num == 4) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >= square4.length || j == square4[0].length) {
							break;
						}
						shape[i][j] = square4[i][j];
					}
				}
			} else if(num == 5) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >= square5.length || j == square5[0].length) {
							break;
						}
						shape[i][j] = square5[i][j];
					}
				}
			} else if(num == 6) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >=square6.length || j == square6[0].length) {
							break;
						}
						shape[i][j] = square6[i][j];
					}
				}
			} else if(num == 7) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >=square7.length || j == square7[0].length) {
							break;
						}
						shape[i][j] = square7[i][j];
					}
				}
			} else if(num == 8) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >=square8.length || j == square8[0].length) {
							break;
						}
						shape[i][j] = square8[i][j];
					}
				}
			} else if(num == 9) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >=square9.length || j == square9[0].length) {
							break;
						}
						shape[i][j] = square9[i][j];
					}
				}
			} else if(num == 10) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >=square10.length || j == square10[0].length) {
							break;
						}
						shape[i][j] = square10[i][j];
					}
				}
			} else if(num == 11) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >=square11.length || j == square11[0].length) {
							break;
						}
						shape[i][j] = square11[i][j];
					}
				}
			} else if(num == 12) {
				for(int i = 0; i < shape.length; i++) {
					for(int j = 0; j < shape[0].length; j++) {
						if(i >=square12.length || j == square12[0].length) {
							break;
						}
						shape[i][j] = square12[i][j];
					}
				}
			}
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("|          !now!          |");
			System.out.println("---------------------------");
			for(int i = 0; i < shape.length; i++) {
				System.out.print("|   	     ");
				for(int j = 0; j < shape[0].length; j++) {
					System.out.print(shape[i][j]);
				}
				System.out.print("  	  |");
				System.out.println();
			}
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			int row = shape.length-1;
			int col = shape[0].length-1;
			for(int i = 0; i < shape.length; i++) {
				int cnt = 0;
				for(int j = 0; j < shape[0].length; j++) {
					if(shape[i][j] == " ") {
						cnt++;
					}
				}
				if(cnt == shape[0].length) {
					row = i-1;
					break;
				}
			}
			for(int i = 0; i < shape[0].length; i++) {
				int cnt = 0;
				for(int j = 0; j < shape.length; j++) {
					if(shape[j][i] == " ") {
						cnt ++;
					}
				}
				if(cnt == shape.length) {
						col = i-1;
						break;
				}
			}
			System.out.println("위치 입력 (도형의 시작 위치 : 0 ~ 24)");
			int loc = in.nextInt();
			in.nextLine();
			for(int i = 0; i <= 1; i++) {
				if(loc+col > game[0].length-1) {
					System.out.println("다시 입력해주세요");
					loc = in.nextInt();
					in.nextLine();
					i =-1;
				} else {
					break;
				}
			}
			for(int i = 0; i <= row; i++) {
				for(int j = 0; j <= col; j++) {
					game[i][loc+j] = shape[i][j];
				}
			}
			for(int i = 0; i < game.length; i++) {
				int indexF = col;
				int indexL = col;
				int count = 0;
				if(i+(row+1) < game.length) {
					for(int j = 0; j <= col; j++) {
						if(shape[row][j] != " ") {
							count ++;
						}
					}
					for(int j = 0; j <= col; j++) {
						if(shape[row][j] == " ") {
							indexF = j;
							break;
						}
					}
					for(int j = col; j >= 0; j--) {
						if(shape[row][j] == " ") {
							indexL = j;
							break;
						}
					}
					if((game[i+(row+1)][loc] != " " && game[i+(row)][loc] != " ") || (game[i+(row+1)][loc+col] != " " && game[i+(row)][loc+col] != " ")) {
						break;
					}
					if(col >= 2) {
						if((game[i+(row+1)][loc+(col/2)] != " " && game[i+(row)][loc+(col/2)] != " ") || (game[i+(row+1)][loc+(col/2+1)] != " " && game[i+(row)][loc+(col/2+1)] != " ")) {
							break;
						}
					}
					if(count != col+1 && num != 7) {
						if(indexF != indexL) {
							if(game[i+row][loc+indexF] != " " || game[i+row][loc+indexL] != " ") {
								break;
							}
						} else if(indexF == indexL) {
							if(game[i+row][loc+indexF] != " ") {
								break;
							}
						}
					}
					for(int j = i+(row+1); j > i; j--) {
						for(int k = loc; k <= loc+col; k++) {
							if(game[j-1][k] != " " && j == i+(row+1)) {
								game[j][k] = game[j-1][k];
							} else if( j != i+(row+1)) {
								game[j][k] = game[j-1][k];
							}
							if(j-1 == i) {
								game[j-1][k] = " ";
							}
						}
					}
				}
				for(int j = 0; j < game.length; j++) {
					for(int k = 0; k < game[0].length; k++) {
						System.out.print(game[j][k]);
						if(k == game[0].length-1) {
							System.out.print(" |");
						}
					}
					System.out.println();
					if(j == 2) {
						System.out.println("********** END ***********|");
					}
					if(j == game.length-1) {
						System.out.println("---------------------------");
						Thread.sleep(50);
					}
				}
			}
			for(int i = game.length-1; i >= 0; i--) {
					int floor = 0;
					for(int j = 0; j < game[0].length; j++) {
						if(game[i][j] != " ") {
							floor++;
						}
					}
					if(floor == game[0].length) {
						System.out.println("목표발견!!!!!!!!!!!!!!!!");
						Thread.sleep(1000);
						for(int j = 0; j < game[0].length; j++) {
							game[i][j] = " ";
						}
						point += 20;
						for(int j = i; j >= i-1; j--) {
							for(int k = 0; k < game[0].length; k++) {
								game[j][k] = game[j-1][k];
							}
						}
						for(int j = 0; j < game.length; j++) {
							for(int k = 0; k < game[0].length; k++) {
								System.out.print(game[j][k]);
							if(k == game[0].length-1) {
								System.out.print(" |");
							}
						}
						System.out.println();
						if(j == game.length-1) {
							System.out.println("---------------------------");
						}
						i = game.length;
					}
				}
			}
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < game[0].length; j++) {
					if(game[i][j] != " ") {
						end ++;
						break;
					}
				}
			}
			if(end > 0) {
				break;
			}
			if(point >= score) {
				System.out.println("level up!");
				level++;
				step -= 10;
				score += 100;
				n = step+1;
			}
		}
		System.out.println("---------------------------");
		System.out.println("|                         |");
		System.out.println("|        GAME OVER!       |");
		System.out.println("|                         |");
		System.out.println("---------------------------");
		System.out.println("최종 점수 : " +point);
	}

}
