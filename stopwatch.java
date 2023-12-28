import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class stopwatch {
    static int sec = 0;
    static int millisec = 0;
    static JTextField display = new JTextField("0.0");
    static boolean stop_state = true;

    static class StopwatchThread extends Thread {
        public void run() {
            stop_state = true;
            sec = 0;
            millisec = 0;
            while (stop_state) {
                try {
                    display.setText(String.format("%d.%d", sec, millisec));
                    Thread.sleep(10); // Update every 10 milliseconds
                    millisec += 10;
                    if (millisec == 1000) {
                        millisec = 0;
                        sec++;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String args[]) {
        StopwatchThread stopwatchThread = new StopwatchThread();
        JFrame frame = new JFrame();
        display.setBounds(90, 10, 80, 50);
        frame.add(display);

        JButton start = new JButton("Start");
        start.setBounds(40, 100, 65, 20);
        frame.add(start);

        JButton stop = new JButton("Stop");
        stop.setBounds(110, 100, 65, 20);
        frame.add(stop);

        ActionListener startListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread t1 = new Thread(stopwatchThread);
                t1.start();
            }
        };
        start.addActionListener(startListener);

        ActionListener stopListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stop_state = false;
            }
        };
        stop.addActionListener(stopListener);

        frame.setSize(250, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
