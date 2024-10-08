package com.st10079970.prixfinance

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.st10079970.prixfinance.databinding.ActivityMainBinding

class BudgetManagementFragment : Fragment() {

    private lateinit var btnView : Button
    private lateinit var btnCreate : Button
    private lateinit var btnUpdate : Button
    private lateinit var btnDelete : Button

    private lateinit var recView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_budget_management, container, false)

        btnView = view.findViewById(R.id.btnViewBudgets)
        btnCreate = view.findViewById(R.id.btnCreateBudgets)
        btnUpdate = view.findViewById(R.id.btnUpdateBudgets)
        btnDelete = view.findViewById(R.id.btnDeleteBudgets)

        btnView.setOnClickListener(){

            replaceFragment(DisplayBudgetFragment())
        }

        btnCreate.setOnClickListener(){
            replaceFragment(CrudBudgetFragment())
        }

        btnUpdate.setOnClickListener(){
            replaceFragment(CrudBudgetFragment())
        }

        btnDelete.setOnClickListener(){
            replaceFragment(CrudBudgetFragment())
        }

        return view
    }

    // Method to replace fragments
    private fun replaceFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }


}