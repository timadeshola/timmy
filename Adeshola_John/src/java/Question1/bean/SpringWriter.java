package Question1.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Question1.writer.IWriter;

@Service
public class SpringWriter {
  private IWriter writer;

  @Autowired
  public void setWriter(IWriter writer) {
    this.writer = writer;
  }

  public void run() {
    String s = "This is my test";
    writer.writer(s);
  }
} 