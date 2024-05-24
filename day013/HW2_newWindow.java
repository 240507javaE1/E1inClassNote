JButton btnNewButton = new JButton("login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 擷取-->username , password-->gettext
				 * equals-->true-->OrderUI
				 * false-->mssage
				 */
				OrderUI o=new OrderUI();
				o.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(200, 196, 85, 23);
		contentPane.add(btnNewButton);