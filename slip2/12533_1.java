import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;


class sorts extends JFrame {

    private JTextArea text;
    private JMenuBar main;
    private JMenu operation;
    private JMenu sort;
    private JMenuItem load,save,asc,desc,exit;
 
    List<Integer> list = new ArrayList<Integer>();

    public sorts() {
        setSize(500, 500);
        setTitle("Sorting");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        text = new JTextArea();

        main = new JMenuBar();
        operation = new JMenu("Operation");
        sort = new JMenu("Sort");

        load = new JMenuItem("Load");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        asc = new JMenuItem("Ascending");
        desc = new JMenuItem("Descending");

        main.add(operation);
        main.add(sort);

        operation.add(load);
        operation.add(save);
        operation.add(exit);

        sort.add(asc);
        sort.add(desc);

        setJMenuBar(main);
        add(new JScrollPane(text));

        load.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent arg0) {
                text.setText("");
                for (int i = 0; i < 10; i++) {
                    int random = (int) (Math.random() * 100 + 1);
                    text.append(random + "\n");
                    list.add(random);
                }

            }

        });

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg1) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("numbers.txt"));
                    for (int i : list) {
                        bw.write(i + "\n");
                    }
                    bw.close();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent args2) {
                System.exit(0);
            }
        });

        asc.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent args3) {
                text.setText("");
                Collections.sort(list);
                for (int i : list) {
                    text.append(i + "\n");
                }
            }

        });
        desc.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent args3) {
                text.setText("");
                Collections.sort(list, Collections.reverseOrder());
                for (int i : list) {
                    text.append(i + "\n");
                }
            }

        });
    }

}

class sorting {
    public static void main(String[] args) {
        new sorts();
    }
}
