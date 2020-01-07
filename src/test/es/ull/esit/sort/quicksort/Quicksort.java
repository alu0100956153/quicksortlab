package test.es.ull.esit.sort.quicksort;

/** class Quicksort
* \brief clase que implementa el metodo de ordenación quicksort

* */
public class Quicksort  {
	/**
	* \brief Variable int[] que guarda los numeros a iterar.
	*/
	private int[] numbers;


	/**
	* \brief Variable int que guarda tamaño de array.
	*/
	private int number;

	
	/**
	* \brief metodo que ordena
	* \param values valores a ordenar
	* 
	*/
	public void sort(int[] values) {



		// Check for empty or null array
		if (values ==null || values.length==0){
			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}





	/**
	* \brief metodo con la recursividad
	* \param low pivote inferior
	* \param high pivote superior
	*/

	private void quicksort(int low, int high) {

		int i = low, j = high;

		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high-low) / 2];

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}

			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (numbers[j] > pivot) {
				j--;
			}



			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
				}
		}

		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	/**
	 * \brief funcion simple para intercambio de dos numeros
	 * \param i numero a intercambiar
	 * \param j numero segundo a intercambiar
	 */
	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;

	}


}
