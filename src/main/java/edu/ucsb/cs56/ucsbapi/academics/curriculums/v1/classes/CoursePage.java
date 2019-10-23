package edu.ucsb.cs56.ucsbapi.academics.curriculums.v1.classes;
import lombok.Data;

@Data
public class CoursePage {
    private int pageNumber;
    private int pageSize;
    private int total;

    public CoursePage() {}
}
