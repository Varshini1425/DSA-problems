function findSecLargest(arr) {
  let largeEle = -Infinity;
  let secLarEle = -Infinity;

  for (let i = 0; i < arr.length; i++) {
    if (largeEle < arr[i]) {
      largeEle = arr[i];
    }
  }

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== largeEle && secLarEle < arr[i]) {
      secLarEle = arr[i];
    } else if (secLarEle === -Infinity) {
      return -1;
    }
  }
  return secLarEle;
}

const arr = [4, 7, 8, 9, 20];
const res = findSecLargest(arr);
console.log("Largest element:", res);
