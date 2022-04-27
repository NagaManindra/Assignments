<<<<<<< HEAD
"use strict";
class Fibo {
    constructor() {
        this.previousNo = Symbol();
        this.currentNo = Symbol();
        this.previousNo = 0;
        this.currentNo = 1;
    }
    next() {
        let nxt = Symbol();
        nxt = this.previousNo + this.currentNo;
        this.previousNo = this.currentNo;
        this.currentNo = nxt;
        return nxt;
    }
}
let obj = new Fibo();
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
=======
"use strict";
class Fibo {
    constructor() {
        this.previousNo = Symbol();
        this.currentNo = Symbol();
        this.previousNo = 0;
        this.currentNo = 1;
    }
    next() {
        let nxt = Symbol();
        nxt = this.previousNo + this.currentNo;
        this.previousNo = this.currentNo;
        this.currentNo = nxt;
        return nxt;
    }
}
let obj = new Fibo();
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
document.write(obj.next() + "<br>");
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
//# sourceMappingURL=q1.js.map