function isPrimeNumber(number) {
  if (number <= 1) return false;
  if (number === 2) return true;
  if (number % 2 === 0) return false;

  let counter = 3;

  while (counter * counter <= number) {
    if (number % counter === 0) {
      return false;
    } else {
      counter += 2;
    }
  }

  return true;
}
