public class StudentNode {
  private String name;
  private double courseAvg;
  private StudentNode nextNodePtr;

  public StudentNode() {
    this.name = "";
    this.courseAvg = 0.0;
    this.nextNodePtr = null;
  }

  public StudentNode(String name, double courseAvg) {
    this.name = name;
    this.courseAvg = courseAvg;
  }

  public void insertAfter(StudentNode nodeLoc) {
    StudentNode tmpNext;

    tmpNext = this.nextNodePtr;
    this.nextNodePtr = nodeLoc;
    nodeLoc.nextNodePtr = tmpNext;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAvg(double avg) {
    this.courseAvg = avg;
  }

  public StudentNode getNext() {
    return nextNodePtr;
  }

  public void printNodeData() {
    System.out.println(this.name + ": " + this.courseAvg);
  }
  
}
