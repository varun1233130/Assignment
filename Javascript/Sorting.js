function descendingBubbleSort(arr) {
    const len = arr.length;
    for (let i = 0; i < len - 1; i++) {
      for (let j = 0; j < len - 1 - i; j++) {
        if (arr[j] < arr[j + 1]) {
          // Swap elements if they are in the wrong order
          let temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }
  
  // Sample array
  const numbers = [5, 2, 9, 1, 5, 6];
  
  // Sorting the array in descending order using custom bubble sort
  const sortedArray = descendingBubbleSort(numbers);
  
  console.log(sortedArray); // Output: [9, 6, 5, 5, 2, 1]
  