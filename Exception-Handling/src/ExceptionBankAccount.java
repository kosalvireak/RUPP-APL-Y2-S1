class  InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
class  InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}
public class ExceptionBankAccount {
    private float amount = 0f;

    public ExceptionBankAccount(float amount){
        this.amount = amount;
    }

    public float getBalance() {
        return amount;
    }

    public void withdraw(float amount) throws InsufficientFundsException{

        if(amount > this.amount){
            throw new InsufficientFundsException("Your withdraw amount is more then current balance.");
        }else{
            this.amount -= amount;
            System.out.println("You withdraw: "+ amount);
        }
    }

    public void deposit(float amount)throws InvalidAmountException{
        if(amount < 0){
            throw new InvalidAmountException("Your deposit amount must be larger than 0.");
        }
        else{
            this.amount += amount;
            System.out.println("You deposit: "+ amount);
        }
    }
    public static void main(String[] args) {
        ExceptionBankAccount exceptionBankAccount = new ExceptionBankAccount(1000);
        System.out.println("You balance is : "+ exceptionBankAccount.getBalance());
        try {
            exceptionBankAccount.withdraw(0);
        }catch (InsufficientFundsException e){
            System.out.println("InsufficientFundsException : " + e.getMessage());
        }
        System.out.println("You balance is : "+ exceptionBankAccount.getBalance());
        try{
            exceptionBankAccount.deposit(0);
        }catch (InvalidAmountException e){
            System.out.println("InvalidAmountException : " + e.getMessage());
        }
        System.out.println("You balance is : "+ exceptionBankAccount.getBalance());
    }
}
