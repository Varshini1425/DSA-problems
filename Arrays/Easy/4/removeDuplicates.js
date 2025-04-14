function removeDuplicates(nums) {
  if (nums.length == 0) return 0;

  let i = 1;
  for (let j = 1; j < nums.length; j++) {
    if (nums[j] != nums[j - 1]) {
      nums[i] = nums[j];
      i++;
    }
  }
  return i;
}

const arr = [0, 1, 1, 1, 1, 2, 2, 5, 5, 5, 6, 6, 6, 7, 8];
const res = removeDuplicates(arr);
console.log("After removing the duplicate from the array: " + res);
