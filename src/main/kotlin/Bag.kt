class Bag(private var amount: Long) {
    private var invitation: Invitation? = null
    var ticket: Ticket? = null

    constructor(invitation: Invitation, amount: Long) : this(amount) {
        this.invitation = invitation
    }

    fun hasInvitation(): Boolean {
        return invitation != null;
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }

    fun minusAmount(amount: Long): Unit {
        this.amount -= amount
    }

    fun plusAmount(amount: Long): Unit {
        this.amount += amount
    }
}