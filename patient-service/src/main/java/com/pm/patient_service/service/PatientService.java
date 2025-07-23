package com.pm.patient_service.service;


import com.pm.patient_service.dto.PatientResponseDTO;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.repository.PatientRepository;
import org.springframework.stereotype.Service;
import com.pm.patientservice.model.Patient;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository= patientRepository;
    }

    public List <PatientResponseDTO> getAllPatients(){
        List<Patient> patients = patientRepository.findAll();

       List <PatientResponseDTO> patientResponseDTOs = patients.stream()
                .map(PatientMapper::toDTO).toList();

    return patientResponseDTOs;
    }
}
