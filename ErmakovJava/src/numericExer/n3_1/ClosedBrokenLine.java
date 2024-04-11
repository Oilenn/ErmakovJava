package numericExer.n3_1;

public class ClosedBrokenLine extends numericExer.n1_5.BrokenLine{
    @Override
    public double getLenght(){
        return super.getLenght() + getLineLenght(points.get(0), points.get(points.size() - 1));
    }
}
