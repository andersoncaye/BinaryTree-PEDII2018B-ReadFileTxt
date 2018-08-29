package apoio;

public class TreeVisualization {

    public static void svg_start() {
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
        System.out.println("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"1028\" height=\"768\">");
        System.out.println();

        System.out.println("  <style type=\"text/css\">");
        System.out.println("      .label { font: normal 24px sans-serif; stroke-width: 0; fill: black }");
        System.out.println("  </style>");
        System.out.println();

        System.out.println("  <g stroke=\"black\" stroke-width=\"2\">");
        //System.out.println("    <circle cx=\"0\"   cy=\"0\"   r=\"20\" fill=\"red\" />");
        //System.out.println("    <circle cx=\"400\" cy=\"0\"   r=\"20\" fill=\"green\" />");
        //System.out.println("    <circle cx=\"0\"   cy=\"400\" r=\"20\" fill=\"blue\" />");
        //System.out.println("    <circle cx=\"400\" cy=\"400\" r=\"20\" fill=\"yellow\" />");
        System.out.println();
    }

    public static void svg(Node n, int x, int y, int d) {
        int leftx = x - d;
        int lefty = y + 60;
        int rightx = x + d;
        int righty = y + 60;

        if (n.left != null) {
            System.out.println("<line   x1=\"" + x + "\" y1=\"" + y
                    + "\" x2=\"" + leftx + "\" y2=\"" + lefty + "\" />");
        }
        if (n.right != null) {
            System.out.println("<line   x1=\"" + x + "\" y1=\"" + y
                    + "\" x2=\"" + rightx + "\" y2=\"" + righty + "\" />");
        }

        System.out.println("    <circle cx=\"" + x + "\" cy=\"" + y
                + "\" r=\"20\" fill=\"#55cccc\" />");
        System.out.println("    <text  x=\"" + (x - 8) + "\"  y=\"" + (y + 8)
                + "\" class=\"label\">" + n.element + "</text>");

        if (n.left != null) {
            svg(n.left, leftx, lefty, d / 2);
        }
        if (n.right != null) {
            svg(n.right, rightx, righty, d / 2);
        }
    }

    public static void svg_finish() {
        System.out.println("  </g>");
        System.out.println("</svg>");
    }

//    public static void main(String[] args) {
//        tree = new BinaryTree("+");
//        Node a = tree.getRoot();
//        Node b = tree.addLeftChild(a, "*");
//        Node c = tree.addRightChild(a, "-");
//        Node d = tree.addLeftChild(b, "+");
//        Node e = tree.addRightChild(b, "5");
//        Node f = tree.addLeftChild(c, "8");
//        Node g = tree.addRightChild(c, "*");
//        tree.addLeftChild(d, "1");
//        tree.addRightChild(d, "4");
//        tree.addLeftChild(g, "3");
//        tree.addRightChild(g, "7");
//
//        //vis1(a);
//        //vis2(a);
//        svg_start();
//        svg(a, 200, 30, 80);
//        svg(a, 764, 30, 80);
//        svg_finish();
//    }
}
