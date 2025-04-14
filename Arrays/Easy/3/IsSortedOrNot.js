function isSortedOrNot(arr) {
  let n = arr.length;
  let cnt = 0;

  for (let i = 0; i < n; i++) {
    if (arr[i] > arr[(i + 1) % n]) {
      cnt++;
    }
    if (cnt > 1) {
      return false;
    }
  }
  return true;
}

const arr = [8, 7, 4, 9, 20];
const res = isSortedOrNot(arr);
console.log("Is this array sorted or not : ", res);
