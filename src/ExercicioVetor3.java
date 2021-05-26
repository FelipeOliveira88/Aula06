
public class ExercicioVetor3 {

	public static void main(String[] args) {
		int valores[] = { 37, 61, 5, 33, 100, 34, 1, 76, 66, 44, 12, 80, 11, 101, 72, 16, 3, 5, 94, 49, 7, 75, 32,
				79 };
		for(int j=0;j<valores.length -1; j++) {
			for (int i=0;i< valores.length - 1;i++) {
				if(valores[i] < valores[i+1]) {
					int aux = valores[i];
					valores[i] = valores[i+1];
					valores[i+1] = aux;
					
				}
			}
		}
		
		
		for(int i=0;i< valores.length;i++) {
			System.out.println(valores[i]);
		}
				

	}

}
