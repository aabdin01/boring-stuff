package lists;

public class NodeInteger {
	NodeInteger next;
    NodeInteger prior;
	int value;

    public NodeInteger(int value) {
        this.value = value;
    }

    public void setNext(NodeInteger next) {
        this.next = next;
    }
	public void setPrior(NodeInteger prior) {
		this.prior = prior;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
    public NodeInteger getNext() {
        return this.next;
    }
    public NodeInteger getPrior() {
        return this.prior;
    }
}
