package proiect;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class WorkManagementSystem {

  // dimensiunea ferestrei
  private static final int WIDTH = 1280;
  private static final int HEIGHT = 720;

  // elementele interfetei grafice
  private JDateChooser calendar;
  private JTextField searchField;
  private JButton newTicketButton;
  private JTable ticketList;
  private DefaultTableModel ticketListModel;

  public WorkManagementSystem() {
    JFrame frame = new JFrame();
	frame.setTitle("Placeholder");

    // setam dimensiunea ferestrei
    frame.setSize(WIDTH, HEIGHT);

    // setam layout-ul ferestrei
    frame.setLayout(new BorderLayout());


 // cream panel-ul din stanga
    JPanel leftPanel = new JPanel();
    leftPanel.setPreferredSize(new Dimension(WIDTH / 3, HEIGHT));
    leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
    frame.add(leftPanel, BorderLayout.WEST);

    // adaugam calendar-ul
    calendar = new JDateChooser();
    leftPanel.add(calendar);

    // adaugam search bar-ul
    JPanel searchPanel = new JPanel();
    searchPanel.setLayout(new BorderLayout());
    leftPanel.add(searchPanel);

    JLabel searchLabel = new JLabel("Search Bar");
    searchPanel.add(searchLabel, BorderLayout.NORTH);

    searchField = new JTextField();
    searchField.setPreferredSize(new Dimension(100, 20));
    // setam dimensiunea calendarului
    calendar.setPreferredSize(new Dimension(WIDTH / 3, searchField.getPreferredSize().height));

    // setam fontul afisat in calendar
    calendar.setFont(searchField.getFont());
    searchPanel.add(searchField, BorderLayout.CENTER);


    // cream panel-ul din dreapta
    JPanel rightPanel = new JPanel();
    rightPanel.setLayout(new BorderLayout());
    frame.add(rightPanel, BorderLayout.EAST);

    // adaugam butonul pentru ticket nou
    newTicketButton = new JButton("New Ticket");
    newTicketButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // cream fereastra modala
        JDialog newTicketDialog = new JDialog(frame, "Adauga Ticket Nou", true);
        newTicketDialog.setSize(400, 200);
        newTicketDialog.setLayout(new BorderLayout());

        // cream panel-ul pentru formularul de adaugare ticket
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2));
        newTicketDialog.add(formPanel, BorderLayout.CENTER);

        // adaugam campurile formularului
        JLabel idLabel = new JLabel("ID Ticket:");
        formPanel.add(idLabel);

        JTextField idField = new JTextField();
        formPanel.add(idField);

        JLabel nameLabel = new JLabel("Nume Ticket:");
        formPanel.add(nameLabel);

        JTextField nameField = new JTextField();
        formPanel.add(nameField);

        JLabel descriptionLabel = new JLabel("Descriere:");
        formPanel.add(descriptionLabel);

        JTextField descriptionField = new JTextField();
        formPanel.add(descriptionField);

        JLabel deadlineLabel = new JLabel("Timp Limita:");
        formPanel.add(deadlineLabel);

        JTextField deadlineField = new JTextField();
        formPanel.add(deadlineField);

        // adaugam butonul de adaugare
        JButton addButton = new JButton("Adauga");
        addButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            String id = idField.getText();
            String name = nameField.getText();
            String description = descriptionField.getText();
            String deadline = deadlineField.getText();

            // adaugam ticket-ul in lista
            String[] ticketData = {id, name, description, deadline};
            ticketListModel.addRow(ticketData);

            // inchidem fereastra modala
            newTicketDialog.dispose();
          }
        });
        newTicketDialog.add(addButton, BorderLayout.SOUTH);

        // afisam fereastra modala
        newTicketDialog.setVisible(true);
      }
      });
        rightPanel.add(newTicketButton, BorderLayout.SOUTH);

        // adaugam lista de ticket-uri
        String[] columnNames = {"ID Ticket", "Nume Ticket", "Descriere", "Timp Limita"};
        ticketListModel = new DefaultTableModel();
        ticketListModel.setColumnIdentifiers(columnNames);
        ticketList = new JTable(ticketListModel);
        ticketList.setFillsViewportHeight(true);
        JScrollPane ticketListScrollPane = new JScrollPane(ticketList);
        rightPanel.add(ticketListScrollPane, BorderLayout.CENTER);

        // afisam fereastra
        frame.setVisible(true);
          }

          public static void main(String[] args) {
            new WorkManagementSystem();
          }
        }
