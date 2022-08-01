package com.Academia.service;

import com.Academia.model.Biotipo;
import com.Academia.model.form.BiotipoFormCreate;
import com.Academia.model.form.BiotipoFormUpdate;

public interface BiotipoService {

    Biotipo create(BiotipoFormCreate from);

    Biotipo update(Long id, BiotipoFormUpdate formUpdate);

    Biotipo delete(Long id);
    Biotipo getBiotipo(Long id);
}
