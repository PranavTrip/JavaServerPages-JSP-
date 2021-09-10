package tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler2 extends TagSupport {

    public int number;

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();

        try {
            for (int i = 1; i <= 10; i++) {
                out.println((i * number) + "<br>");
            }
        } catch (Exception e) {
           e.printStackTrace();

        }
        return SKIP_BODY;
    }

}
