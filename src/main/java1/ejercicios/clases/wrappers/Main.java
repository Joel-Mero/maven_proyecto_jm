package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte primitivo
		byte datoByte = 2; // Primitivo
		Byte datoByteWrapper = 3; // Wrapper
		System.out.println("Primitivo: " + datoByte);
		System.out.println("Wrapper: " + datoByteWrapper);
		// Conversiones
		byte datoByte1 = 5;
		Byte datoConvertido = datoByte1;
		System.out.println("Dato Convertido: " + datoConvertido);
		// Conversiones 2
		Byte datoConvertido1 = 6;
		byte datoByte2 = datoConvertido1.byteValue();
		System.out.println("Dato Byte: " + datoConvertido1);
		System.out.println();
		
		// short
		short datoShort = 1; // Primitivo
		Short datoShortWrapper = 1; // Wrapper
		System.out.println("Primitivo: " + datoShort);
		System.out.println("Wrapper: " + datoShortWrapper);
		// Conversiones
		short datoShort1 = 4;
		Short shortConvertido = datoShort1;
		System.out.println("Dato Convertido: " + datoShort1);
		// Conversiones 2
		Short shortConvertido1 = 6;
		short datoShort2 = shortConvertido1.shortValue();
		System.out.println("Dato Short: " + shortConvertido1);
		System.out.println();

		// int
		int edad = 45; // Primitivo
		Integer edadWrapper = 48; // Wrapper
		System.out.println("Primitivo: " + edad);
		System.out.println("Wrapper: " + edadWrapper);
		// Conversiones
		int edad1 = 4;
		Integer integerConvertido = edad1;
		System.out.println("Dato Convertido: " + edad1);
		// Conversiones 2
		Integer integerConvertido1 = 6;
		int edad2 = integerConvertido1.intValue();
		System.out.println("Int Convertido: " + integerConvertido1);
		System.out.println();
		
		// long
		long valorGrande = 12321; // Primitivo
		Long valorGrandeWrapper = 123123L; // Wrapper
		System.out.println("Primitivo: " + valorGrande);
		System.out.println("Wrapper: " + valorGrandeWrapper);
		// Conversiones
		long valorGrande1 = 4;
		Long longConvertido = valorGrande1;
		System.out.println("Dato Convertido: " + valorGrande1);
		// Conversiones 2
		Long longConvertido1 = 23423L;
		long valorGrande2 = longConvertido1.longValue();
		System.out.println("Int Convertido: " + longConvertido1);
		System.out.println();

		// boolean
		boolean valorVerdad = true; // Primitivo
		Boolean valorVerdadWrapper = false; // Wrapper
		System.out.println("Primitivo: " + valorVerdad);
		System.out.println("Wrapper: " + valorVerdadWrapper);
		// Conversiones
		boolean valorVerdad1 = true;
		Boolean booleanConvertido = valorVerdad1;
		System.out.println("Dato Convertido: " + valorVerdad1);
		// Conversiones 2
		Boolean booleanConvertido1 = false;
		boolean valorVerdad2 = booleanConvertido1.booleanValue();
		System.out.println("Int Convertido: " + booleanConvertido1);
		System.out.println();

		// float
		float valor = 1; // Primitivo
		Float valorWrapper = 9F; // Wrapper
		System.out.println("Primitivo: " + valor);
		System.out.println("Wrapper: " + valorWrapper);
		// Conversiones
		float valor1 = 23;
		Float floatConvertido = valor1;
		System.out.println("Dato Convertido: " + valor1);
		// Conversiones 2
		Float floatConvertido1 = 65F;
		float valor2 = floatConvertido1.floatValue();
		System.out.println("Int Convertido: " + floatConvertido1);
		System.out.println();

		// double
		double valorDecimal = 12.34; // Primitivo
		Double valorDecimalWrapper = 34.78; // Wrapper
		System.out.println("Primitivo: " + valorDecimal);
		System.out.println("Wrapper: " + valorDecimalWrapper);
		// Conversiones
		double valorDecimal1 = 23.65;
		Double doubleConvertido = valorDecimal1;
		System.out.println("Dato Convertido: " + valorDecimal1);
		// Conversiones 2
		Double doubleConvertido1 = 65.78;
		double valorDecimal2 = doubleConvertido1.doubleValue();
		System.out.println("Int Convertido: " + doubleConvertido1);
		System.out.println();

		// char
		char letraAlfabeto = 'J'; // Primitivo
		Character letraAlfabetoWrapper = 'C'; // Wrapper
		System.out.println("Primitivo: " + letraAlfabeto);
		System.out.println("Wrapper: " + letraAlfabetoWrapper);
		// Conversiones
		char letraAlfabeto1 = 'F';
		Character charConvertido = letraAlfabeto1;
		System.out.println("Dato Convertido: " + letraAlfabeto1);
		// Conversiones 2
		Character charConvertido1 = 'R';
		char letraAlfabeto2 = charConvertido1.charValue();
		System.out.println("Int Convertido: " + charConvertido1);

	}

}
