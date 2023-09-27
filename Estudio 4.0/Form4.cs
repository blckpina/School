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
    public partial class Form4 : Form
    {
        public Form4()
        {
            InitializeComponent();
        }

        private void txtExcluir_KeyPress(object sender, KeyPressEventArgs e)
        {
            Aluno aluno = new Aluno(txtExcluir.Text);
            if(e.KeyChar == 13)
            {
                if (aluno.consultarAluno());
                {
                    if (aluno.excluirAluno());
                    {
                        MessageBox.Show("Aluno Excluído");
                    }
                }                              
            }
        }
    }
}
