class Bag(private var amount: Long) {
    private var invitation: Invitation? = null
    var ticket: Ticket? = null

    constructor(invitation: Invitation, amount: Long) : this(amount) {
        this.invitation = invitation
    }

    private fun hasInvitation(): Boolean {
        return invitation != null;
    }

    private fun minusAmount(amount: Long): Unit {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long): Unit {
        this.amount += amount
    }

    fun hold(ticket: Ticket): Long {
        if (hasInvitation()) {
            this.ticket = ticket
            return 0
        } else {
            this.ticket = ticket
            minusAmount(ticket.fee)
            return ticket.fee
        }
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }

}