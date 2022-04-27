<<<<<<< HEAD
import {Account} from './Account.js';
export class SavingAccount extends Account{
    constructor(id,name,balance,interest){
           super(id,name,balance);
           this.interest  = interest;
    }
    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance + (this.balance*this.interest);
        return this.totalBalance;
    }
=======
import {Account} from './Account.js';
export class SavingAccount extends Account{
    constructor(id,name,balance,interest){
           super(id,name,balance);
           this.interest  = interest;
    }
    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance + (this.balance*this.interest);
        return this.totalBalance;
    }
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
}