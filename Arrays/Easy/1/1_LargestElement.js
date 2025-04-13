function findLargest(arr) {
  console.log("Before logic:" + arr);
  let maxEle = -Infinity;

  for (let i = 0; i < arr.length; i++) {
    if (maxEle < arr[i]) {
      maxEle = arr[i];
    }
  }
  console.log("After logic:" + arr);

  return maxEle;
}

const arr = [4, 7, 8, 9, 20];
const res = findLargest(arr);
console.log("Largest element:", res);
