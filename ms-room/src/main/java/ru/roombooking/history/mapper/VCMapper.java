package ru.roombooking.history.mapper;

public interface VCMapper<Model, DTO> {
    DTO toDTO(Model model);

    Model toModel(DTO dto);
}