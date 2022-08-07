
public class ChessBoard {
	public static void main(String args[]) {
		char whiteSq='\u25A1';
		char blackSq='\u25A0';
		char sqr;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0) {
					sqr = (j%2!=0?whiteSq:blackSq);
				}
				else {
					sqr = (j%2==0?whiteSq:blackSq);
				}
				System.out.print(sqr+" ");
			}
			System.out.println();
		}
	}

}
