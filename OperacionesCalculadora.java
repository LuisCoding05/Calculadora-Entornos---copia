public class OperacionesCalculadora {

    public double sumar (double numUno, double numDos) {
        return (numUno + numDos);
    }
    
	public double restar (double numUno, double numDos) {
		return (numUno - numDos);
	}
		
	public double multiplicar (double numUno, double numDos) {
		return (numUno * numDos);
	}
		
	public int dividir (int numUno, int numDos) {
		return (numUno / numDos);
	}
	public double elevar (double numUno, double numDos){
		return Math.pow(numUno, numDos); 
	}
}
