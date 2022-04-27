<<<<<<< HEAD
import {Account} from './Account.js';

export class CurrentAccount extends Account{
    constructor(id,name,balance,cash_credit){
           super(id,name,balance);
           this.cash_credit  = cash_credit;
    }
    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance -this.cash_credit;
        return this.totalBalance;
    }
=======
import {Account} from './Account.js';

export class CurrentAccount extends Account{
    constructor(id,name,balance,cash_credit){
           super(id,name,balance);
           this.cash_credit  = cash_credit;
    }
    getBalance(){
        this.totalBalance=0;
        this.totalBalance = this.balance -this.cash_credit;
        return this.totalBalance;
    }
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
}