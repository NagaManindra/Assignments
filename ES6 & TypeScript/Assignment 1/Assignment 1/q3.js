<<<<<<< HEAD
"use strict";
let order = {
    id: 123,
    title: "Hide&seek",
    price: 20,
    printOrder: function () {
        document.write("Id : " + this.id + "<br>" + this.title + "<br>");
    },
    getPrice: function () {
        document.write("" + this.price);
    }
};
let order1 = Object.assign(order);
order1.printOrder();
order1.getPrice();
document.write("<br>" + JSON.stringify(order1));
=======
"use strict";
let order = {
    id: 123,
    title: "Hide&seek",
    price: 20,
    printOrder: function () {
        document.write("Id : " + this.id + "<br>" + this.title + "<br>");
    },
    getPrice: function () {
        document.write("" + this.price);
    }
};
let order1 = Object.assign(order);
order1.printOrder();
order1.getPrice();
document.write("<br>" + JSON.stringify(order1));
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
//# sourceMappingURL=q3.js.map