//> using scala "3"

// run me with 'scala-cli Swing.scala'

import java.awt.{BorderLayout, Dimension}
import javax.swing.{JFrame, JScrollPane, JTextArea, WindowConstants}

@main def SwingExample = 
    val textArea = JTextArea("Hello, Swing world")
    val scrollPane = JScrollPane(textArea)

    val frame = JFrame("Hello, Swing")
    frame.getContentPane.add(scrollPane, BorderLayout.CENTER)
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
    frame.setSize(new Dimension(600, 400))
    frame.setLocationRelativeTo(null)
    frame.setVisible(true)


