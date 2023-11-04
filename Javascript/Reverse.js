function reverseWordsManually(sentence) {
    let reversedSentence = '';
    let word = '';
  
    for (let i = 0; i < sentence.length; i++) {
      if (sentence[i] === ' ') {
        let reversedWord = '';
        for (let j = word.length - 1; j >= 0; j--) {
          reversedWord += word[j];
        }
        reversedSentence += reversedWord + ' ';
        word = '';
      } else {
        word += sentence[i];
      }
    }
  
    // Reversing the last word
    let reversedWord = '';
    for (let j = word.length - 1; j >= 0; j--) {
      reversedWord += word[j];
    }
    reversedSentence += reversedWord;
  
    return reversedSentence;
  }
  
  // Example usage:
  const inputSentence = "This is a sunny day";
  const reversedWords = reverseWordsManually(inputSentence);
  console.log(reversedWords); // Output: "sihT si a ynnus yad"
  