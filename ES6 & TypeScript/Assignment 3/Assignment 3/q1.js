<<<<<<< HEAD
"use strict";
var promise1 = new Promise(function (resolve, reject) {
    let x = 10;
    if (x != 0) {
        resolve(x);
    }
    else {
        reject("x value is 0");
    }
});
var promise2 = new Promise(function (resolve, reject) {
    let y = 20;
    if (y != 0) {
        resolve(y);
    }
    else {
        reject("y value is 0");
    }
});
Promise.all([promise1, promise2]).then(function (values) {
    let sum = 0;
    for (let num in values) {
        sum += values[num];
    }
    document.write(sum);
});
=======
"use strict";
var promise1 = new Promise(function (resolve, reject) {
    let x = 10;
    if (x != 0) {
        resolve(x);
    }
    else {
        reject("x value is 0");
    }
});
var promise2 = new Promise(function (resolve, reject) {
    let y = 20;
    if (y != 0) {
        resolve(y);
    }
    else {
        reject("y value is 0");
    }
});
Promise.all([promise1, promise2]).then(function (values) {
    let sum = 0;
    for (let num in values) {
        sum += values[num];
    }
    document.write(sum);
});
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
//# sourceMappingURL=q1.js.map