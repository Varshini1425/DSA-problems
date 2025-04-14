function rotateByOne(arr) {
  let n = arr.length;
  let temp = arr[0];

  for (let i = 0; i < n - 1; i++) {
    arr[i] = arr[i + 1];
  }
  arr[n - 1] = temp;
}
const arr = [2, 1, 4, 5, 9];
rotateByOne(arr);
console.log("After rotating the array : ", arr.join(" "));
