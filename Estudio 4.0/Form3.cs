﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Estudio
{
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
        }


        private void button1_Click(object sender, EventArgs e)
        {
            Aluno aluno = new Aluno(txtCPF.Text, txtNome.Text, txtEndereco.Text, txtNumero.Text, txtBairro.Text,
                txtComplemento.Text, txtCEP.Text, txtCidade.Text, txtEstado.Text, txtTelefone.Text, txtEmail.Text);

            if (aluno.cadastrarAluno())
                MessageBox.Show("Cadastro realizado com sucesso");
            else
                MessageBox.Show("Erro no cadastro");
        }

        private void txtCPF_KeyPress(object sender, KeyPressEventArgs e)
        {
            Aluno aluno = new Aluno(txtCPF.Text);

            if(e.KeyChar == 13)
            {
                if(aluno.consultarAluno())
                {
                    MessageBox.Show("Aluno já cadastrado!");
                }
                else
                {
                    txtNome.Focus();
                }
                DAO_Conexao.con.Close();
            }
        }
    }
}
