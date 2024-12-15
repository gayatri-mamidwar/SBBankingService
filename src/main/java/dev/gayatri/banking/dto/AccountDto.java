package dev.gayatri.banking.dto;

public class AccountDto {

    private Long id;
    private String accountHolderName;
    private double balance;

    public AccountDto(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Long getId() {
        return this.id;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AccountDto)) return false;
        final AccountDto other = (AccountDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$accountHolderName = this.getAccountHolderName();
        final Object other$accountHolderName = other.getAccountHolderName();
        if (this$accountHolderName == null ? other$accountHolderName != null : !this$accountHolderName.equals(other$accountHolderName))
            return false;
        if (Double.compare(this.getBalance(), other.getBalance()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AccountDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $accountHolderName = this.getAccountHolderName();
        result = result * PRIME + ($accountHolderName == null ? 43 : $accountHolderName.hashCode());
        final long $balance = Double.doubleToLongBits(this.getBalance());
        result = result * PRIME + (int) ($balance >>> 32 ^ $balance);
        return result;
    }

    public String toString() {
        return "AccountDto(id=" + this.getId() + ", accountHolderName=" + this.getAccountHolderName() + ", balance=" + this.getBalance() + ")";
    }
}
