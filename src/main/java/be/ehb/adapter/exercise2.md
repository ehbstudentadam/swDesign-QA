## FigureDrawer
Write a FigureDrawer class that supports the following methods:
- drawCircle(Point centre, float radius)
- drawRectangle(Point leftup, Point rightdown)
- drawTriangle(Point one, Point two, Point three)
- drawSquare(Point leftup, int size)

You may work with System.out.println in the implementation without really drawing the
geometric figures.

Attention: first program the functionality requested above ... do not read further!

Your companion who is working on your project and has written the code to draw some
shapes. However, he is not very good at communicating with you and he has therefore
made a little mistake in writing his interface that you were going to support ... You can
find this code on the electronic learning environment. Add the MainDrawer class and
the IFigureDrawable interface that he wrote to your project.

Make sure you can call the drawAllKindsofFigures() method with a FigureDrawer object
you have created. It is clear that this will not work with the code created above, so write
an adapter so that it can work.

IMPORTANT: do not change anything in the supplied code, since this has involved
thousands of hours (!) of programming work.