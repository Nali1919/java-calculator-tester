package org.lessons.math;

	public class Calculator {
		
		public float addizione(float num1, float num2) {
			return num1 + num2;
		}
		public float sottrazione(float num1, float num2) {
			return num1 - num2;
		}
		public float moltiplicazione(float num1, float num2) throws Exception {
			if(num1 == 0 || num2 == 0) {
				throw new Exception("Attento! non si moltiplica per 0");
			}
			return num1 * num2;
		}
		public float divisione(float num1, float num2) throws Exception {
			if(num1 == 0 || num2 == 0) {
				throw new Exception("Attento! non si divide per 0");
			}
			return num1 / num2;
		}
	}
