const ages = [10, 6, 15, 93, 42, 7, 32];
let maxAge = 0;

for (let i = 0; i < ages.length; i++) {
    maxAge = Math.max(maxAge, ages[i]);
}

console.log(maxAge);