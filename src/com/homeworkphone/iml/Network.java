package com.homeworkphone.iml;

public class Network {

	private int[] number = new int[]  {159645};
	private int[] MyNum = new int[] {159645} ;

	public int registration(int MyNum){
		if(MyNum == 159645){
			System.out.println("Соединение установленно ");
			System.out.println("Вы в Сети  .:|  ");
		}
		else {
			System.out.println("Сеть не доступна ...");
		}
		return MyNum;
	}

		public void  call(){
			for(int o = 0 ; o < number.length;o++) {
				for (int x = 0; x < MyNum.length; x++) {
					if (number.length == MyNum.length) {
						System.out.println("Номер в списке найден!->>>>>> Звоню ");
						break;
					} else {
						System.out.println(" не звоню ");
					}
				}
			}
	}


	public int[] getNumber() {
		return number;
	}
	public void setNumber(int[] number) {
		this.number = number;
	}


}
