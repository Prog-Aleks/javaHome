package com.homeworkoop.in;

public class Cat {

	private String cat ;
	private int vote ;
	private String food ;

	private int rectangl ;
	private int rectanglLine  ;
    private int summRectangl ;



	public Cat(int rectangl, int rectanglLine){
		this.rectangl = rectangl;
		this.rectanglLine =  rectanglLine;
	}



	public int rectangl(int rectanglLine,int rectangl){

		return rectangl / rectanglLine;
	}



	public Cat(String cat, int vote, String food){
		super();
		this.cat = cat ;
		this.vote = vote ;
		this.food = food ;
	}

	public Cat(){ super();}

	public int print(){
		System.out.println("Cat: "+ this.cat);
		System.out.println("Vote: "+vote);
		System.out.println("Food: "+food);
		return 1;
	}



	@Override
	public String toString() {
		return "Cat{" + "cat='" + cat + '\'' +
				", vote=" + vote + "," +
				" food='" + food + '\'' + '}';
	}

	public int getVote() {
		return vote;
	}
	public void setVote(int vote) {
		this.vote = vote;
	}
	
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}

	public int getRectangl() {
		return rectangl;
	}
	public void setRectangl(int rectangl) {
		this.rectangl = rectangl;
	}

	public int getRectanglLine() {
		return rectanglLine;
	}
	public void setRectanglLine(int rectanglLine) {
		this.rectanglLine = rectanglLine;
	}
}
