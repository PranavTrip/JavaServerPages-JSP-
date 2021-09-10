package tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport {

    @Override
    public int doStartTag() throws JspException {

        JspWriter out = pageContext.getOut();

        try {
            out.println("<h1>This is the first custom tag without using attributes </h1>");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }

}
