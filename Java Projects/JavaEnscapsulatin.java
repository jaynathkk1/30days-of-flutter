class A
{
	private int value;
	public void setValue(int x){
		value=x;
	}
	public int getValue(){
		return value;
	}
}
class B
{
	public static void main(String[] args) {
		A r=new A();
		r.setValue(100);
		System.out.print(r.getValue());
	}
}