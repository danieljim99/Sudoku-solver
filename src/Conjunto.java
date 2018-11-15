public class Conjunto {
	boolean possible[];
	
	Conjunto(){
		possible = new boolean[9];
		for(int i = 0; i < 9; i++) {
			possible[i] = true;
		}
	}
	
	void addPossible(int n) {
		if(n > 0 && n < 10) {
			possible[n - 1] = true;
		}
	}
	
	void removePossible(int n) {
		if(n > 0 && n < 10) {
			possible[n - 1] = false;
		}
	}

	int theOnlyPossible() {
		int n = 0;
		int cont = 0;
		for(int i = 0; i < 9; i++) {
			if(possible[i]) {
				cont++;
				n = i + 1;
			}
		}
		if(cont != 1) {
			n = 0;
		}
		return n;
	}
	
	void leaveOne(int n) {
		if(n > 0 && n < 10) {
			for(int i = 0; i < 9; i++) {
				possible[i] = false;
			}
			possible[n - 1] = true;
		}
	}
}